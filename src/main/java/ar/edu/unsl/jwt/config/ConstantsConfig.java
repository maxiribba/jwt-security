package ar.edu.unsl.jwt.config;

public interface ConstantsConfig {

	// Spring security
	public static final String HEADER_AUTHORIZACION_KEY = "Authorization";
	public static final String TOKEN_BEARER_PREFIX = "Bearer";

	// JWT
	public static final String ISSUER_INFO = "http://www.unsl.edu.ar";
	public static final String SIGNATURE_KEY = "topSecretKey";
	public static final long TOKEN_EXPIRATION_TIME = 3600000; // 1 hora en ms
	
}
