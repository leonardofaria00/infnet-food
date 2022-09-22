package br.infnet.infnetfood.domain.service.snack;

import br.infnet.infnetfood.domain.data.model.refeicao.petisco.Petisco;
import br.infnet.infnetfood.domain.data.printer.AppImpressao;
import br.infnet.infnetfood.domain.repository.snack.SnackRepository;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class SnackService {

    private final SnackRepository snackRepository;

    public SnackService(final SnackRepository snackRepository) {
        this.snackRepository = snackRepository;
    }

    public void create(final Petisco petisco, final String message) {
        snackRepository.create(petisco);
        AppImpressao.relatorio(message, petisco);
    }

    public Collection<Petisco> getAll() {
        return snackRepository.getAll();
    }

    public void remove(final Integer id) {
        snackRepository.remove(id);
        System.out.printf("Deleted id: %s%n", id);
    }
}
