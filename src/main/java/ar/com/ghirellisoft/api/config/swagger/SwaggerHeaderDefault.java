package ar.com.ghirellisoft.api.config.swagger;

import io.swagger.v3.oas.models.headers.Header;
import io.swagger.v3.oas.models.parameters.HeaderParameter;
import io.swagger.v3.oas.models.parameters.Parameter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static ar.com.ghirellisoft.api.config.swagger.HeaderGlobal.*;

public class SwaggerHeaderDefault {

    SwaggerHeaderDefault() {
    }

    public static List<Parameter> getSwaggerHeader() {
        return Stream.of(
                new HeaderParameter()
                        .name("x-idSession")
                        .description("Identificador único de sesión.Mediante este identificador se agruparán una serie de operaciones, bajo un criterio definido por el canal.Así pues, para citar un ejemplo, el Homebanking puede agrupar todas las operaciones que realiza un usuario en una sesión (login) particular indicando el mismo código en este campo.En el caso de que el canal no envíe el campo idProcess, este debe ser único e irrepetible (por ejemplo, un número incremental).")
                        .in("header")
                        .required(false),
                new HeaderParameter()
                        .name("x-idProceso")
                        .description("Identificador único de petición de servicio. En caso que el canal posea un mecanismo de identificación unívoca por cada operación realizada, el mismo debe incluirse en este campo para que la localización de un mensaje se pueda concretar rápidamente.---El campo no es obligatorio y, en caso de no ser especificada la información (sin el tag o sin datos dentro del tag), el MW autogenerará un número.")
                        .in("header")
                        .required(false),
                new HeaderParameter()
                        .name("x-canal")
                        .description("Usuario identificador del canal con el que fue invocado el servicio.En el caso de que el canal sea de atención directa (Emerix, Prisma, Mesa de Cambio), es el usuario del empleado que se encarga de ejecutar el servicio.")
                        .in("header")
                        .required(false),
                new HeaderParameter()
                        .name("x-subCanal")
                        .description("Este campo brinda la posibilidad a un canal de agrupar las invocaciones mediante algún criterio establecido, para poder, posteriormente, consultar los reportes. Para mencionar un ejemplo, el canal Mobile, agrupa las invocaciones dependiendo del dispositivo dónde se originaron y envía los códigos identificatorios para Blackberry, Android, etc.")
                        .in("header")
                        .required(false),
                new HeaderParameter()
                        .name("x-usuario")
                        .description("Identificador de Cobis (IdCobis) del cliente.")
                        .in("header")
                        .required(false),
                new HeaderParameter()
                        .name("x-usuarioCanal")
                        .description("Usuario identificador del canal con el que fue invocado el servicio. En el caso de que el canal sea de atención directa (Emerix, Prisma, Mesa de Cambio), es el usuario del empleado que se encarga de ejecutar el servicio.")
                        .in("header")
                        .required(false),
                new HeaderParameter()
                        .name("x-sucursal")
                        .description("Indica el código de sucursal desde la cual se invoca el servicio.")
                        .in("header")
                        .required(false),
                new HeaderParameter()
                        .name("x-operador")
                        .description("Dominio y nombre del operador BH que utiliza el sistema que invoca el servicio. El formato del campo es [DOMINIO][USUARIO] En otros casos se puede utilizar el nombre de máquina.")
                        .in("header")
                        .required(false),
                new HeaderParameter()
                        .name("x-usuarioIP")
                        .description("Deberá contener dirección IP del cliente desde donde se realiza la consulta.")
                        .in("header")
                        .required(false),
                new HeaderParameter()
                        .name("x-sistema")
                        .description("Identificador del sistema desde donde se realiza la invocación")
                        .in("header")
                        .required(false)).collect(Collectors.toList());
    }
}
