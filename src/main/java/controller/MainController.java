
package controller;


import lombok.AllArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import java.util.Optional;

@Controller
@AllArgsConstructor
public class MainController {

   //LOGIN
    @GetMapping("/login")
    public String login() {
        return "login";
    }

    //PAGINA PRINCIPAL
    @GetMapping("/")
    public String homePage() {
        return "homeTeste";
    }

    @GetMapping("/jaca")
    public String home() {
        return "home";
    }


    //PAGINAS SIMPLES
    @GetMapping("/error")
    public String erro() {
        return "error";
    }
}





/* //------------------ HTML CATEGORIAS

    @RequestMapping("/falenciaPessoal/categorias")
    public ModelAndView listarCategoria(){
        ModelAndView mv = new ModelAndView("listarCategoria");
        Iterable<Categoria> categorias = catRepository.findAll();
        mv.addObject("categorias", categorias);
        return mv;
    }

    @RequestMapping(value="/falenciaPessoal/categorias/add", method=RequestMethod.GET)
    public String form(){
        return "addCategoria";
    }

    @PostMapping("/falenciaPessoal/categorias/add")
    public String form(@Validated Categoria categoria, BindingResult result, RedirectAttributes attributes){

        if(result.hasErrors()){
            attributes.addFlashAttribute("mensagem", "Verifique os campos!");
            return "redirect:/falenciaPessoal/categorias/addCategoria";
        }

        catRepository.save(categoria);
        attributes.addFlashAttribute("mensagem", "Categoria cadastrada com sucesso!");
        return "redirect:/falenciaPessoal/categorias";
    }

    @RequestMapping("/falenciaPessoal/categorias/delete/{id}")
    public String deletarCategoria(@PathVariable("id") Integer codigo){
        catRepository.deleteById(codigo);
        return "redirect:/falenciaPessoal/categorias";
    }

    @RequestMapping(value="/falenciaPessoal/categorias/edit/{id}",method = RequestMethod.GET)
    public ModelAndView detalhesCategoria(@PathVariable("id") Integer codigo){
        ModelAndView mv = null;
        Optional<Categoria> categoria = catRepository.findById(codigo);
        if(categoria.isPresent()){
            mv = new ModelAndView("editCategoria");
            mv.addObject("categoria", categoria.get());
        }

        return mv;
    }

    @RequestMapping("/falenciaPessoal/categorias/edit/{id}")
    public String editarCategoria(@PathVariable("id") Integer id, @Validated Categoria categoria, BindingResult result, Model model){

        Optional<Categoria> existingCategoriaOptional = catRepository.findById(id);
        if (existingCategoriaOptional.isPresent()) {
            Categoria categoriaSalva = existingCategoriaOptional.get();
            BeanUtils.copyProperties(categoria, categoriaSalva, "id_categoria");
            catRepository.save(categoriaSalva);
        }

        return "redirect:/falenciaPessoal/categorias";
    }

    //------------------ HTML CATEGORIAS*//*


}
*/
