<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01//EN" "http://www.w3.org/TR/html4/strict.dtd">



<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.*, liga.*"%>

<HTML>
  <HEAD>
    <META http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <TITLE>Listado de Equipos de la liga</TITLE>
  </HEAD>
  <BODY>
    <DIV> 
      <H2>Listado de Equipos de la liga</H2>
      
      <!-- Creamos una tabla y sus celdas de encabezamiento -->
      <TABLE border='1'>
        <TR>
          <TH>Codigo</TH>
          <TH>Nombre</TH>
          <TH>Estadio</TH>
          <TH>Aforo</TH>
          <TH>Fundacion</TH>
          <TH>Ciudad</TH>
          <TH>Presidente</TH>
        </TR>
        
        
        
          <%
			ArrayList<Equipos> listaEquipos=(ArrayList<Equipos>)request.getAttribute("equipos");
		    if(listaEquipos!=null) {
      		  for(int i=0;i<listaEquipos.size();i++) {
        		Equipos equipos=(Equipos)listaEquipos.get(i);
          %>
                <TR>
                  <TD><%=equipos.getCodigo()%></TD>
                  <TD><%=equipos.getNombre()%></TD>
                  <TD><%=equipos.getEstadio()%></TD>
                  <TD><%=equipos.getAforo()%></TD>
                  <TD><%=equipos.getFundacion()%></TD>
                  <TD><%=equipos.getCiudad()%></TD>
                  <TD><%=equipos.getPresidente()%></TD>
                </TR>
          <%  }
            }%>
      </TABLE>
      <A href="index.html">Volver al inicio</A>
    </DIV>
  </BODY>
</HTML>