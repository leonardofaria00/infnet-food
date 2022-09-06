package br.infnet.infnetfood.domain.service.dinner;

import br.infnet.infnetfood.domain.data.model.refeicao.janta.Janta;
import br.infnet.infnetfood.domain.data.printer.AppImpressao;
import br.infnet.infnetfood.domain.repository.dinner.DinnerRepository;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class DinnerService {

    private final DinnerRepository dinnerRepository;

    public DinnerService(final DinnerRepository dinnerRepository) {
        this.dinnerRepository = dinnerRepository;
    }

    public Collection<Janta> getAll() {
        System.out.println("Find Dinners...");
        return dinnerRepository.getAll();
    }

    public void remove(final String uuid) {
        dinnerRepository.remove(uuid);
    }

    public void create(final Janta janta, final String message) {
        dinnerRepository.create(janta);
        AppImpressao.relatorio(message, janta);
    }
}
