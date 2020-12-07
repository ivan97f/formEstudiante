/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EstudianteManagedBean;

import Tratamiento_Estudiantes.TbEstudiante;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Ivan
 */
@Local
public interface TbEstudianteFacadeLocal {

    void create(TbEstudiante tbEstudiante);

    void edit(TbEstudiante tbEstudiante);

    void remove(TbEstudiante tbEstudiante);

    TbEstudiante find(Object id);

    List<TbEstudiante> findAll();

    List<TbEstudiante> findRange(int[] range);

    int count();
    
}
