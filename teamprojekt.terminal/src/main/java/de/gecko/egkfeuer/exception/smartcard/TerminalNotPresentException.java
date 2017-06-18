package de.gecko.egkfeuer.exception.smartcard;

public class TerminalNotPresentException extends CardException
{
	private static final long serialVersionUID = 1L;

	public TerminalNotPresentException()
	{
		super();
	}

	public TerminalNotPresentException(String message)
	{
		super(message);
	}

	public TerminalNotPresentException(Throwable cause)
	{
		super(cause);
	}
	
	public TerminalNotPresentException(String message, Throwable cause)
	{
		super(message, cause);
	}
}
