package com.arjoo.exceptions;

import java.util.Date;

public record ApiError(String errorCode, String desc, Date date) {
}
