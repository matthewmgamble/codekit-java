/* vim: set expandtab tabstop=4 shiftwidth=4 softtabstop=4 */

/*
 * ====================================================================
 * LICENSE: Licensed by AT&T under the 'Software Development Kit Tools
 * Agreement.' 2014.
 * TERMS AND CONDITIONS FOR USE, REPRODUCTION, AND DISTRIBUTIONS:
 * http://developer.att.com/sdk_agreement/
 *
 * Copyright 2014 AT&T Intellectual Property. All rights reserved.
 * For more information contact developer.support@att.com
 * ====================================================================
 */

package com.att.api.ads.service;

public enum Premium {
    NO_PREMIUM(0), ONLY_PREMIUM(1), ALL(2);

    private final int val;

    private Premium(int val) {
        this.val = val;
    }

    public int getValue() {
        return this.val;
    }
}
