/*
 * Copyright 2023 Kapeta Inc.
 * SPDX-License-Identifier: MIT
 */

package com.kapeta.spring.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
public class InvalidStateException extends RuntimeException {

}
