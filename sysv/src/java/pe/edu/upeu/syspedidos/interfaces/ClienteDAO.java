/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.upeu.syspedidos.interfaces;

import java.util.List;
import java.util.Map;
import pe.edu.upeu.syspedidos.dto.Cliente;

/**
 *
 * @author alum.fial8
 */
public interface ClienteDAO {
    int create(Cliente c);
    int update(Cliente c);
    int delete(int key);
    Cliente read(int key);
    List<Map<String, Object>> readAll();
}
