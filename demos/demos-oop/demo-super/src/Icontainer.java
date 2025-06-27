import java.util.Set;
import enums.ContainerType;
public interface Icontainer {
    String getReferencia();
    int getVolume();
    int volumeDisposable();
    int getResistance();
    Set<Iproduct> getProductos();
    String geType();
    int getSurface();
    boolean canInsert(Iproduct product);
    boolean isresistantto(Iproduct product);
}
