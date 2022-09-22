package br.infnet.infnetfood.domain.service.launch;

import br.infnet.infnetfood.domain.data.model.refeicao.almoco.Almoco;
import br.infnet.infnetfood.domain.data.printer.AppImpressao;
import br.infnet.infnetfood.domain.repository.launch.LaunchRepository;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class LaunchService {

    private final LaunchRepository launchRepository;

    public LaunchService(final LaunchRepository launchRepository) {
        this.launchRepository = launchRepository;
    }

    public void create(final Almoco almoco, final String message) {
        launchRepository.create(almoco);
        AppImpressao.relatorio(message, almoco);
    }

    public Collection<Almoco> getAll() {
        return launchRepository.getAll();
    }

    public void remove(final Integer id) {
        launchRepository.remove(id);
        System.out.printf("Deleted id: %s%n", id);
    }
}
