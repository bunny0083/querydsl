/*
 * Copyright (c) 2008 Mysema Ltd.
 * All rights reserved.
 * 
 */
package com.mysema.query.grammar;

/**
 * Order represents ascending and descending order
 * 
 * @author tiwe
 * @version $Id$
 */
public enum Order {
    ASC{
        public String toString(){
            return "asc";
        }
    }, 
    DESC{
        public String toString(){
            return "desc";
        }
    }
}