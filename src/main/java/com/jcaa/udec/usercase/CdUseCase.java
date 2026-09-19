package com.jcaa.udec.usecase;

import com.jcaa.udec.domain.Cd;
import com.jcaa.udec.ports.CdRepository;
import java.util.List;

public class CdUseCase {
    private final CdRepository repository;

    // Inyección de dependencias manual: recibimos el puerto por el constructor
    public CdUseCase(CdRepository repository) {
        this.repository = repository;
    }

    public void crearCd(Cd cd) { repository.create(cd); }
    public Cd buscarCd(String id) { return repository.read(id); }
    public void actualizarCd(Cd cd) { repository.update(cd); }
    public void eliminarCd(String id) { repository.delete(id); }
    public List<Cd> listarCds() { return repository.listAll(); }
}