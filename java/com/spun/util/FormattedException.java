package com.spun.util;

public class FormattedException extends RuntimeException
{
  public FormattedException(String string, Object... params)
  {
    super(String.format(string, params));
    //SimpleLogger.variable(this.getMessage());
  }
}
