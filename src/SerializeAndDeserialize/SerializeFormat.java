package SerializeAndDeserialize;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class SerializeFormat implements Externalizable {
    public String geometrictPrimitiveType;

    public SerializeFormat(String geometrictPrimitiveType) {
        this.geometrictPrimitiveType = geometrictPrimitiveType;
    }

    @Override
    public void writeExternal(ObjectOutput oo) throws IOException {
        oo.writeObject(geometrictPrimitiveType);

    }

    @Override
    public void readExternal(ObjectInput oi) throws IOException, ClassNotFoundException {
        geometrictPrimitiveType = (String)oi.readObject();

    }

}
