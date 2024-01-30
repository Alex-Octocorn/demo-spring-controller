package fr.octorn.demospringcontroller.calculatrice;

import fr.octorn.demospringcontroller.calculatrice.dto.CalculatriceDto;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/calc")
public class CalculatriceController {
    private CalculatriceService calculatriceService;

    public CalculatriceController(CalculatriceService calculatriceService) {
        this.calculatriceService = calculatriceService;
    }

    @GetMapping("/add") // /calc/add?a=1&b=2
    public int add(@RequestParam int a, @RequestParam int b) {
        return calculatriceService.additionner(a, b);
    }

    @PostMapping("/sus")
    public int sus(@RequestBody CalculatriceDto calculatriceDto) {
        return calculatriceService.soustraire(
                calculatriceDto.getPremierNombre(),
                calculatriceDto.getSecondNombre()
        );
    }
}
