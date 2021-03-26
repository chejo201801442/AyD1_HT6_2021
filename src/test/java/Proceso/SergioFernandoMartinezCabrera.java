/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proceso;

import Objetos.Carrera;
import Objetos.Horario;
import Objetos.RegistroAcademico;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.BDDMockito.given;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import static org.mockito.Mockito.when;
import org.mockito.MockitoAnnotations;
import org.mockito.Spy;

/**
 *
 * @author Sergio
 */
public class SergioFernandoMartinezCabrera {

    @InjectMocks
    private AsignarHorario testHorario;

    @Mock
    Carrera carrera;

    @Mock
    RegistroAcademico registro;

    @Mock
    Horario horario;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void validateCode() {
        try {
            when(registro.cheequearCarnet()).thenReturn(true);
            when(registro.getAnio()).thenReturn(1999);

            try {
                when(carrera.procesarCarrera()).thenReturn(3);
            } catch (Exception e) {
                System.out.println(e);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    @Test
    public void validateDescription() {
        try {
            horario = new Horario(283, "Analisis y Diseño 1");
            assertEquals("Analisis y Diseño 1", horario.getDescripcion());

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
