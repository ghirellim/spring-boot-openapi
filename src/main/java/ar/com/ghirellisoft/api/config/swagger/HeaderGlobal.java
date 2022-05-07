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
        public static final String HEADER_SESSION_DESCRIPTION = "Identificador único de sesión.";
        public static final String HEADER_ID_PROCESO_DESCRIPTION = "Identificador único de petición de servicio.";
        public static final String HEADER_USARIO_DESCRIPTION = "Identificador con el que se identifica al cliente.";
        public static final String HEADER_CANAL_DESCRIPTION = "Canal de comunicación.Persona o app externa.";
        public static final String HEADER_SUB_CANAL_DESCRIPTION = "Subcanal de comunicación. App externa, o sub proceso.";
        public static final String HEADER_OPERADOR_DESCRIPTION = "Operador que realiza la petición en nombre del cliente.";
        public static final String HEADER_USUARIO_CANAL_DESCRIPTION = "Usuario que realiza la petición en nombre de la app que consulta (Opcional).";
        public static final String HEADER_USUARIO_IP_DESCRIPTION = "Dirección IP del cliente, o servidor de applicaiones.";
        public static final String HEADER_SISTEMA_DESCRIPTION = "Nombre de app externa (Opcional).";
        public static final String HEADER_SUCURSAL_DESCRIPTION = "Nombre o numero del negocio (Opcional).";



    }
}
