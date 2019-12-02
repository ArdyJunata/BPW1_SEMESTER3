/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan9;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Lab330-29
 */
public class MahasiswaFacade {

    public Mahasiswa[] getDaftarMahasiswa() {
        Mahasiswa[] daftarMahasiswa = null;
        Mahasiswa tempMahasiswa = null;
        ArrayList listMahasiswa = new ArrayList();

        Connection con = null;
        Statement stmt = null;
        ResultSet rs = null;

        String dbUrl = "jdbc:derby://localhost:1527/db_ardy";
        String pwd = "root";
        String login = "root";
        String sql = "Select nim, nama_mhs, prodi from mahasiswa";

        try {
            Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
            con = DriverManager.getConnection(dbUrl, login, pwd);
            stmt = con.createStatement();
            rs = stmt.executeQuery(sql);

            String nim = null;
            while (rs.next()) {
                tempMahasiswa = new Mahasiswa();
                tempMahasiswa.setNim(rs.getString("nim"));
                tempMahasiswa.setNama_mhs(rs.getString("nama_mhs"));
                tempMahasiswa.setProdi(rs.getString("prodi"));
                listMahasiswa.add(tempMahasiswa);
            }

            daftarMahasiswa = new Mahasiswa[listMahasiswa.size()];
            listMahasiswa.toArray(daftarMahasiswa);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                rs.close();
                stmt.close();
                con.clearWarnings();
                return daftarMahasiswa;
            } catch (SQLException e) {
                e.printStackTrace();
                return daftarMahasiswa;
            }
        }
    }

    public Mahasiswa[] getDataMahasiswa(String nim) {
        Mahasiswa[] dataMahasiswa = null;
        Mahasiswa tempMahasiswa = null;
        ArrayList listMahasiswa = new ArrayList();

        Connection con = null;
        Statement stmt = null;
        ResultSet rs = null;

        String dbUrl = "jdbc:derby://localhost:1527/db_ardy";
        String pwd = "root";
        String login = "root";
        String sql = "select * from mahasiswa where nim='" + nim + "'";

        try {
            Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
            con = DriverManager.getConnection(dbUrl, login, pwd);
            stmt = con.createStatement();
            rs = stmt.executeQuery(sql);

            if (rs.next()) {
                tempMahasiswa = new Mahasiswa();
                tempMahasiswa.setNim(rs.getString("nim"));
                tempMahasiswa.setNama_mhs(rs.getString("nama_mhs"));
                tempMahasiswa.setProdi(rs.getString("prodi"));
                listMahasiswa.add(tempMahasiswa);
            }

            dataMahasiswa = new Mahasiswa[listMahasiswa.size()];
            listMahasiswa.toArray(dataMahasiswa);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                rs.close();
                stmt.close();
                con.clearWarnings();
                return dataMahasiswa;
            } catch (SQLException e) {
                e.printStackTrace();
                return dataMahasiswa;
            }
        }
    }
}
