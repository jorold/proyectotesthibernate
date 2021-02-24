package controllers;

import helpers.HelperDepartamentos;
import java.util.List;
import pojos.Dept;

public class ControllerDepartamentos {

    HelperDepartamentos helper;

    public String getTablaDepartamentos() {
        this.helper = new HelperDepartamentos();
        List<Dept> departamentos = this.helper.getDepartamentos();
        String html = "<table border='1'>";
        html += "<thead>";
        html += "<tr><th>Número</th><th>Nombre</th><th>Localidad</th></tr>";
        html += "</thead>";
        html += "<tbody>";
        for (Dept d : departamentos) {
            html += "<tr>";
            html += "<td>" + d.getDeptNo() + "</td>";
            html += "<td>" + d.getDnombre() + "</td>";
            html += "<td>" + d.getLoc() + "</td>";
            html += "</tr>";
        }
        html += "</tbody>";
        html += "</table>";
        return html;
    }
}
