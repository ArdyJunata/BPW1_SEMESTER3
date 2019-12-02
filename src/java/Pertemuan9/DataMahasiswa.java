package Pertemuan9;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Lab330-29
 */
public class DataMahasiswa extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            String nim = request.getParameter("nim");
            MahasiswaFacade mahasiswaFcd = new MahasiswaFacade();
            Mahasiswa Mahasiswa = null;
            Mahasiswa[] daftarMahasiswa = mahasiswaFcd.getDataMahasiswa(nim);
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet dataMahasiswa</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Daftar Mahasiswa</h1>");
            out.println("<hr/>");
            out.println("<table>");
            for (int i = 0; i < daftarMahasiswa.length; i++) {
                out.println("<tr>"
                        + "<td>NIM</td>"
                        + "<td>:</td>"
                        + "<td>" + daftarMahasiswa[i].getNim() + "</td>"
                        + "</tr>");
                out.println("<tr>"
                        + "<td>Nama Mahasiswa</td>"
                        + "<td>:</td>"
                        + "<td>" + daftarMahasiswa[i].getNama_mhs()+ "</td>"
                        + "</tr>");
                out.println("<tr>"
                        + "<td>Program Studi</td>"
                        + "<td>:</td>"
                        + "<td>" + daftarMahasiswa[i].getProdi()+ "</td>"
                        + "</tr>");
            }
            out.println("</table>");
            out.println("</body>");
            out.println("</html>");
        } finally {
            out.close();
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

}
