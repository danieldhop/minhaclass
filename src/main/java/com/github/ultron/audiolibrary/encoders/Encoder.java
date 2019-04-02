package com.github.ultron.audiolibrary.encoders;

public interface Encoder {

    void encode(short[] buf, int pos, int len);

    void close();

}
