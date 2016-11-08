package com.parthirecipes.apps;

public class ChainResponsebilityPatternEx {

	public static void main(String[] args) {

		LoggerService logger = new LoggerService();
		logger.log(Logger.LEVEL.INFO, "Hello info message");
		logger.log(Logger.LEVEL.ERROR, "Hello ERROR please log message");
	}
}

interface Logger {

	public enum LEVEL {
		INFO, ERROR;
	}

	public void downStreamLogger(Logger logger);

	public void writeLogMessage(String message);
}

class LoggerService {

	private AbstractLogger info, error, file, db;

	public LoggerService() {

		info = new InfoLogger();
		error = new ErrorLogger();
		file = new FileLogger();
		db = new DBLogger();

		file.downStreamLogger(db);
		error.downStreamLogger(file);
	}

	public void log(Logger.LEVEL level, String message) {

		if (level.name().equalsIgnoreCase("ERROR")) {
			error.writeLogMessage(message);
		} else {
			info.writeLogMessage(message);
		}
	}
}

abstract class AbstractLogger implements Logger {

	private Logger logger;

	@Override
	public void writeLogMessage(String message) {
		System.out.println(this.getClass().getCanonicalName() + " >>> " + message);
		doAnyAdditionalTask();
		if (logger != null) {
			logger.writeLogMessage(message);
		}
	}

	@Override
	public void downStreamLogger(Logger logger) {
		this.logger = logger;
	}

	public abstract void doAnyAdditionalTask();
}

class InfoLogger extends AbstractLogger {

	@Override
	public void doAnyAdditionalTask() {
		System.out.println(this.getClass().getCanonicalName() + " >>> Done Logging");
	}

}

class ErrorLogger extends AbstractLogger {

	@Override
	public void doAnyAdditionalTask() {
		System.out.println(this.getClass().getCanonicalName() + " >>> Done Logging");
	}
}

class FileLogger extends AbstractLogger {

	@Override
	public void doAnyAdditionalTask() {
		System.out.println(this.getClass().getCanonicalName() + " >>> Done Logging");
	}
}

class DBLogger extends AbstractLogger {

	@Override
	public void doAnyAdditionalTask() {
		System.out.println(this.getClass().getCanonicalName() + " >>> Done Logging");
	}
}
