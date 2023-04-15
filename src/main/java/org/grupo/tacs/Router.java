package org.grupo.tacs;
import org.grupo.tacs.controllers.*;
import spark.Spark;

import static spark.Spark.*;

public class Router {
    public static void main(String[] args){
        // HTTP port
        port(8080);
        Spark.staticFileLocation("../frontend");
        //No creo que tengamos que cargar valores a la DB
        //Defino Rutas
        get("/usuarios", UserController::obtenerUsuarios);
        get("/usuarios/:id", UserController::obtenerUsuario);
        post("/usuarios",UserController::nuevoUsuario);

    }
}
