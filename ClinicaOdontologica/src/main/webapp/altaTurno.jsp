<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="components/header.jsp"%>
<%@include file="components/body1.jsp" %>
        <h1>Dar Turnos</h1>
        <p>Este es el apartado para dar turnos a los diferentes pacientes del sistema.</p>

        <form class="user" action="SvTurnos" method="post">
                <div class="form-group row">
                        
                        <div class="col-sm-6 mb-3">
                                <input class="form-control form-control-user" id="fecha" name="fecha"
                                      placeholder="Fecha" >
                          </div>
                        <div class="col-sm-6 mb-3">
                                <input type="text" class="form-control form-control-user" id="hora" name="hora"
                                      placeholder="Hora">
                        </div>
                       
                        <div class="col-sm-6 mb-3">
                            <input type="text" class="form-control form-control-user" id="tipoconsulta" name="tipoconsulta"
                                      placeholder="Tipo consulta">
                        </div>
                         
                </div>
                <!--Proximamente: todo lo que respecta a horarios y usuarios-->
                <button href="SvTurnos" class="btn btn-primary btn-user btn-block" type="submit">
                    Crear Turno
                </button>
                <hr>
               
            </form>
<%@include file="components/body2.jsp" %>
