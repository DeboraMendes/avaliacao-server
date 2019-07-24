package br.com.viasoft.avaliacao.controller;

//import br.com.caelum.vraptor.*;
//import br.com.caelum.vraptor.observer.upload.UploadedFile;
import br.com.viasoft.avaliacao.model.Empresa;
import br.com.viasoft.avaliacao.repository.EmpresaRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
//import org.apache.commons.io.IOUtils;

//import javax.inject.Inject;
import javax.servlet.ServletContext;
import java.io.File;
import java.io.FileOutputStream;

//import static br.com.caelum.vraptor.view.Results.json;
//import static br.com.caelum.vraptor.view.Results.status;

@Controller
@RequestMapping("/empresa")
public class EmpresaController {

//    private Result result;
    private EmpresaRepository empresaRepository;
//
//    public EmpresaController() {
//    }
//
//    @Inject
//    public EmpresaController(Result result, EmpresaRepository empresaRepository) {
//        this.result = result;
//        this.empresaRepository = empresaRepository;
//    }
//
    @GetMapping(value = {"/", ""})
    public @ResponseBody String listEmpresa(Model model) {
        Iterable<Empresa> empresas = empresaRepository.findAll();
        model.addAttribute("empresas", empresas);
        return "empresas";
    }
//
//    @Get
//    @Path(value = "/form")
//    public void form() {
//        result.include("empresa", new Empresa());
//    }
//
//    @Get
//    @Path(value = "/form/{id}")
//    public void form(Long id) {
//        result.include("empresa", empresaRepository.findById(id));
//    }
//
//    @Post
//    @Path(value = "/")
//    public void salvar(Empresa empresa,
//            UploadedFile foto,
//            ServletContext context) {
//        try {
//            if (empresa.getId() != null && empresa.getId() > 0) {
//                empresaRepository.update(empresa);
//            } else {
//                empresaRepository.insert(empresa);
//            }
//            if (foto != null) {
//                salvarImagem(foto, context,
//                        empresa.getId());
//            }
//            result.use(status()).ok();
//        } catch (Exception ex) {
//            ex.printStackTrace();
//            result.use(status())
//                    .badRequest("ERRO");
//        }
//    }
//
//    @Delete
//    @Path(value = "/{id}")
//    public void remover(Long id) {
//        empresaRepository.delete(id);
//        result.use(status()).ok();
//    }
//
//    private void salvarImagem(UploadedFile foto, ServletContext context, Long id) {
//        try {
//            String caminho = "C:\\Users\\Debora\\Downloads\\img\\empresa";
//            File dir = new File(caminho);
//            if (!dir.exists()) {
//                dir.mkdirs();
//            }
//            String extensao = foto.getFileName()
//                    .substring(
//                            foto.getFileName().lastIndexOf("."),
//                            foto.getFileName().length());
//            File destino = new File(caminho + "\\" + id + extensao);
//            try (FileOutputStream fos = new FileOutputStream(destino)) {
//                IOUtils.copy(foto.getFile(), fos);
//            }
//            Empresa empresa = empresaRepository.findById(id);
//            empresa.setCaminhoFoto(String.valueOf(destino));
//            empresaRepository.update(empresa);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//
//    @Get
//    @Path(value = "/json")
//    public void listJson() {
//        result.use(json()).withoutRoot().from(empresaRepository.findAll()).serialize();
//    }
//
//    @Get
//    @Path(value = "/img/{id}")
//    public File listImg(Long id){
//        Empresa empresa = empresaRepository.findById(id);
//        return new File(empresa.getCaminhoFoto());
//    }
}
