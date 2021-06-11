package com.common.result;

import java.io.Serializable;

/**
 * @author suyu
 */
public abstract class AbstractSignUser implements Serializable {

    private static final long serialVersionUID = 1514226244979796668L;

    public abstract void signUserCheck();

    @Override
    public String toString() {
        return "AbstractSignUser{}";
    }
}
