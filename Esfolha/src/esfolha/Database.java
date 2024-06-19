/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package esfolha;

/**
 *
 * @author Luis
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Database {
    private static final String URL = "jdbc:mysql://localhost:3306/esfolha";
    private static final String USER = "root";
    private static final String PASSWORD = "root";

    public static Connection conectar() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }

    public static void salvarAtributos(Personagem personagem, String tipo) throws SQLException {
        try (Connection conn = conectar()) {
            String sql = "INSERT INTO personagens (tipo, ataque, stamina, vida, defesa) VALUES (?, ?, ?, ?, ?)";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, tipo);
            stmt.setInt(2, personagem.ataque);
            stmt.setInt(3, personagem.stamina);
            stmt.setInt(4, personagem.vida);
            stmt.setInt(5, personagem.defesa);
            stmt.executeUpdate();
        }
    }

    public static void carregarAtributos(Personagem personagem, String tipo) throws SQLException {
        try (Connection conn = conectar()) {
            String sql = "SELECT ataque, stamina, vida, defesa FROM personagens WHERE tipo = ?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, tipo);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                personagem.ataque = rs.getInt("ataque");
                personagem.stamina = rs.getInt("stamina");
                personagem.vida = rs.getInt("vida");
                personagem.defesa = rs.getInt("defesa");
            }
        }
    }
}

