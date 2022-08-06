package com.rpam.rd.autotasks;

import java.io.FileNotFoundException;
import java.io.IOException;

public class CatchEmAll {
    //You may set another exception in this field;
    static Exception exception = new FileNotFoundException();
    static Exception exception1 = new IOException();
    static Exception exception2=new ArithmeticException();
    static Exception exception3= new NumberFormatException();

    public static void riskyMethod() throws Exception {
        throw exception;
    }

    public static void main(String[] args) throws Exception {
        try{
            riskyMethod();
        }
        catch (FileNotFoundException fnf) {
            //System.out.println("Resource Error");
            throw new IllegalArgumentException("Resource is missing", fnf);
        }
        catch ( IOException io) {
            System.out.println("Resource is missing");
            throw new IllegalArgumentException("Resource error",io);
        }
        catch(ArithmeticException ae) {
            System.err.println(ae.getMessage());
        }
        catch (NumberFormatException nfe) {
            System.err.println(nfe.getMessage());
        }
    }
}
