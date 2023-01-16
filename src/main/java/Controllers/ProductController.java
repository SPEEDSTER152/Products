package Controllers;

import entities.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import services.ProductService;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/product")
public class ProductController {

  @Autowired
  private ProductService productService;

  @PostMapping
    public ResponseEntity<Product> findByid(@PathVariable("codeproduct") UUID newProduct){
     UUID product = ProductService.save(newProduct);
     return new ResponseEntity<>(product, HttpStatus.CREATED);
  }

  @GetMapping("/{codeproduct}")
    public ResponseEntity<List<Product>> findbyNamePorduct(@PathVariable("codeProduct") String nameProduct){
    return new ResponseEntity<>(productService.findById(codeProduct),HttpStatus.OK);
  }
  @GetMapping("/find")
    public ResponseEntity<List<Product>> findByNameProduct(@RequestParam("nameproduct") String NameProduct){
    String Nameproduct = null;
    List<Product> products = ProductService.findByNameProduct(Nameproduct);
      if(products.isEmpty()){
          return new ResponseEntity<>(HttpStatus.NO_CONTENT);
      }
      return new ResponseEntity<>(products, HttpStatus.OK);
  }
  @GetMapping
    public ResponseEntity<List<Product>> findall(){
      return new ResponseEntity<>(productService.findall(), HttpStatus.OK);
  }
}
