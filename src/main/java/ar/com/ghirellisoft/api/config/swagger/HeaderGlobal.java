package ar.com.ghirellisoft.api.config.swagger;


import lombok.Getter;

public enum HeaderGlobal {
    HEADER_SESSION(Constants.HEADER_SESSION,Constants.HEADER_SESSION_DESCRIPTION ),
    HEADER_ID_PROCESO(Constants.HEADER_ID_PROCESO,Constants.HEADER_ID_PROCESO_DESCRIPTION ),
    HEADER_USARIO(Constants.HEADER_USARIO,Constants.HEADER_USARIO_DESCRIPTION ),
    HEADER_CANAL(Constants.HEADER_CANAL,Constants.HEADER_CANAL_DESCRIPTION ),
    HEADER_SUB_CANAL(Constants.HEADER_SUB_CANAL,Constants.HEADER_SUB_CANAL_DESCRIPTION ),
    HEADER_OPERADOR(Constants.HEADER_OPERADOR, Constants.HEADER_OPERADOR_DESCRIPTION),
    HEADER_USUARIO_CANAL(Constants.HEADER_USUARIO_CANAL, Constants.HEADER_USUARIO_CANAL_DESCRIPTION),
    HEADER_USUARIO_IP(Constants.HEADER_USUARIO_IP, Constants.HEADER_USUARIO_IP_DESCRIPTION),
    HEADER_SISTEMA(Constants.HEADER_SISTEMA, Constants.HEADER_SISTEMA_DESCRIPTION),
    HEADER_SUCURSAL(Constants.HEADER_SUCURSAL, Constants.HEADER_SUCURSAL_DESCRIPTION);


    private HeaderGlobal(String name, String description) {
        this.name = name;
        this.description = description;
    }


    @Override
    public String toString() {
        return String.valueOf(this.name);
    }

    @Getter
        private final String name;
    @Getter
        private final String description;

    private static class Constants {
        //======  HEADER ======
        public static final String HEADER_SESSION = "x-idSesion";
        public static final String HEADER_ID_PROCESO= "x-idProceso";
        public static final String HEADER_USARIO="x-usuario";
        public static final String HEADER_CANAL="x-canal";
        public static final String HEADER_SUB_CANAL="x-subCanal";
        public static final String HEADER_OPERADOR="x-operador";
        public static final String HEADER_USUARIO_CANAL="x-usuarioCanal";
        public static final String HEADER_USUARIO_IP="x-usuarioIp";
        public static final String HEADER_SISTEMA="x-sistema";
        public static final String HEADER_SUCURSAL="x-sucursal";


        //====== DESCRIPTIONS DE HEADERS ======
        public static final String HEADER_SESSION_DESCRIPTION = "Identificador único de sesión.Mediante este identificador se agruparán una serie de operaciones, bajo un criterio definido por el canal.Así pues, para citar un ejemplo, el Homebanking puede agrupar todas las operaciones que realiza un usuario en una sesión (login) particular indicando el mismo código en este campo.En el caso de que el canal no envíe el campo idProcess, este debe ser único e irrepetible (por ejemplo, un número incremental).";
        public static final String HEADER_ID_PROCESO_DESCRIPTION = "Identificador único de petición de servicio. En caso que el canal posea un mecanismo de identificación unívoca por cada operación realizada, el mismo debe incluirse en este campo para que la localización de un mensaje se pueda concretar rápidamente.---El campo no es obligatorio y, en caso de no ser especificada la información (sin el tag o sin datos dentro del tag), el MW autogenerará un número.";
        public static final String HEADER_USARIO_DESCRIPTION = "Identificador de Cobis (IdCobis) del cliente.";
        public static final String HEADER_CANAL_DESCRIPTION = "Usuario identificador del canal con el que fue invocado el servicio.En el caso de que el canal sea de atención directa (Emerix, Prisma, Mesa de Cambio), es el usuario del empleado que se encarga de ejecutar el servicio.";
        public static final String HEADER_SUB_CANAL_DESCRIPTION = "Este campo brinda la posibilidad a un canal de agrupar las invocaciones mediante algún criterio establecido, para poder, posteriormente, consultar los reportes. Para mencionar un ejemplo, el canal Mobile, agrupa las invocaciones dependiendo del dispositivo dónde se originaron y envía los códigos identificatorios para Blackberry, Android, etc.";
        public static final String HEADER_OPERADOR_DESCRIPTION = "Dominio y nombre del operador BH que utiliza el sistema que invoca el servicio. El formato del campo es [DOMINIO][USUARIO] En otros casos se puede utilizar el nombre de máquina.";
        public static final String HEADER_USUARIO_CANAL_DESCRIPTION = "Usuario identificador del canal con el que fue invocado el servicio. En el caso de que el canal sea de atención directa (Emerix, Prisma, Mesa de Cambio), es el usuario del empleado que se encarga de ejecutar el servicio.";
        public static final String HEADER_USUARIO_IP_DESCRIPTION = "Deberá contener dirección IP del cliente desde donde se realiza la consulta.";
        public static final String HEADER_SISTEMA_DESCRIPTION = "Identificador del sistema desde donde se realiza la invocación del servicio.";
        public static final String HEADER_SUCURSAL_DESCRIPTION = "Indica el código de sucursal desde la cual se invoca el servicio.";



    }
}
