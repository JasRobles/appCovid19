package com.appCovidBeneficiario.DAO;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.appCovidBeneficiario.Entidades.personas;
import com.unab.appCovidBeneficiario.ConexionBD.ConexionBD;

public class ClsPersona {

	ConexionBD con = new ConexionBD();
	Connection Conexion = con.RetornarConexion();
	
	public ArrayList<personas> persona (personas per ){
		ArrayList<personas> person = new ArrayList<personas>();
		try {
			CallableStatement cs = Conexion.prepareCall("call SP_MOSTRARPERSONA (?)");
			cs.setString("Pdui", per.getDui());
			ResultSet resul = cs.executeQuery();
			while (resul.next()) {
				
				personas persona = new personas();
				persona.setDui(resul.getString("dui"));
				persona.setNombre(resul.getString("nombre"));
				persona.setApellido(resul.getString("apellido"));
				persona.setDireccion(resul.getString("direccion"));
				person.add(persona);
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		return person;
	} 
}
