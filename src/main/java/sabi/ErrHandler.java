/*
 * ErrHandler class.
 * Copyright (C) 2022 Takayuki Sato. All Rights Reserved.
 */
package sabi;

import java.time.OffsetDateTime;

/**
 * This class is a handler of an {@link Err} object creation.
 */
@FunctionalInterface
public interface ErrHandler {

  /**
   * Handles an {@link Err} object which will be created rigth after.
   *
   * @param err  An {@link Err} object.
   * @param odt  {@link OffsetDateTime} object which is the current time.
   */
  void handle(Err err, OffsetDateTime odt);
}
