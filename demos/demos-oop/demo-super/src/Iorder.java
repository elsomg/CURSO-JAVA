import java.util.Set;

public interface Iorder {
  String getReferencia();
  Set<Iproduct>getProducts();
  Set<Icontainer>getcontainers();

  void addContainer (Icontainer container);
  Icontainer addProduct(Iproduct product);
}
