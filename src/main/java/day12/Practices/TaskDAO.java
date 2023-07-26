package day12.Practices;


import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class TaskDAO {
    public int id;
    public String name;
    public String status;


public class DAOException extends Exception {
    
    public DAOException(String message, Throwable cause) {
        super(message, cause);
    }
}

 public class Task {
    public String url = "jdbc:mysql://localhost/project";
    public String username = "root";
    public String password = "123456";

    public  void createTask(TaskDAO taskDAO) throws DAOException {
        try (Connection conn = DriverManager.getConnection(url, username, password)) {
            String insertQuery = "INSERT INTO task (id, name, status) VALUES (?, ?, ?)";
            try (PreparedStatement pstmt = conn.prepareStatement(insertQuery)) {
                pstmt.setInt(1, taskDAO.id);
                pstmt.setString(2, taskDAO.name);
                pstmt.setString(3, taskDAO.status);
                pstmt.executeUpdate();
            }
        } catch (SQLException e) {
            throw new DAOException("Error creating task",e);
        }
    }

    public  void updateTask(TaskDAO taskDAO) throws DAOException {
        try (Connection conn = DriverManager.getConnection(url, username, password)) {
            String updateQuery = "UPDATE task SET name = ?, status = ? WHERE id = ?";
            try (PreparedStatement pstmt = conn.prepareStatement(updateQuery)) {
                pstmt.setString(1, taskDAO.name);
                pstmt.setString(2, taskDAO.status);
                pstmt.setInt(3, taskDAO.id);
                pstmt.executeUpdate();
            }
        } catch (SQLException e) {
            throw new DAOException("Error updating task", e);
        }
    }

    public void deleteTask(int taskId) throws DAOException {
        try (Connection conn = DriverManager.getConnection(url, username, password)) {
            String deleteQuery = "DELETE FROM task WHERE id = ?";
            try (PreparedStatement pstmt = conn.prepareStatement(deleteQuery)) {
                pstmt.setInt(1, taskId);
                pstmt.executeUpdate();
            }
        } catch (SQLException e) {
            throw new DAOException("Error deleting task", e);
        }
    }

    public  List<TaskDAO> getAllTasks() throws DAOException {
        List<TaskDAO> taskDAOs = new ArrayList<>();
        try (Connection conn = DriverManager.getConnection(url, username, password)) {
            String selectQuery = "SELECT id, name, status FROM task";
            try (Statement stmt = conn.createStatement()) {
                ResultSet rs = stmt.executeQuery(selectQuery);
                while (rs.next()) {
                    TaskDAO taskDAO = new TaskDAO();
                    taskDAO.id = rs.getInt("id");
                    taskDAO.name = rs.getString("name");
                    taskDAO.status = rs.getString("status");
                    taskDAOs.add(taskDAO);
                }
            }
        } catch (SQLException e) {
            throw new DAOException("Error getting tasks", e);
        }
        return taskDAOs;
    }
}
}