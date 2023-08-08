<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="components/header.jsp"%>
<%@include file="components/body1.jsp" %>
        <h1>Alta Odontólogos</h1>
        <p>Este es el apartado para dar de alta los diferentes odontologos del sistema.</p>
        <form class="user">
                <div class="form-group row">
                        <div class="col-sm-6 mb-3">
                              <input type="text" class="form-control form-control-user" id="dni"
                                    placeholder="Dni">
                        </div>
                        <div class="col-sm-6 mb-3">
                                <input type="text" class="form-control form-control-user" id="nombre"
                                      placeholder="Nombre">
                          </div>
                        <div class="col-sm-6 mb-3">
                                <input type="text" class="form-control form-control-user" id="apellido"
                                      placeholder="Apellido">
                          </div>
                          <div class="col-sm-6 mb-3">
                                <input type="text" class="form-control form-control-user" id="telefono"
                                      placeholder="Telefono">
                          </div>
                          <div class="col-sm-6 mb-3">
                                <input type="text" class="form-control form-control-user" id="direccion"
                                      placeholder="Direccion">
                          </div>
                          <div class="col-sm-6 mb-3">
                                <input type="text" class="form-control form-control-user" id="fechanac"
                                      placeholder="Fecha Nacimiento">
                          </div>
                          <div class="col-sm-6 mb-3">
                                <input type="text" class="form-control form-control-user" id="especialidad"
                                      placeholder="Especialidad">
                          </div>
                </div>
                <!--Proximamente: todo lo que respecta a horarios y usuarios-->
                <a href="#" class="btn btn-primary btn-user btn-block">
                    Crear Odontólogo
                </a>
                <hr>
               
            </form>
<%@include file="components/body2.jsp" %>
