package org.academiadecodigo.hackstreetboys.services.mock;

import org.academiadecodigo.hackstreetboys.persistence.model.Beach;
import org.academiadecodigo.hackstreetboys.services.BeachService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MockBeachService extends AbstractMockService<Beach> implements BeachService {

    @Override
    public List<Beach> list() {
        return modelList;
    }

    @Override
    public Beach get(Integer id) {
        return modelList.get(id);
    }

    @Override
    public Beach save(Beach beach) {
        modelList.add(beach);
        return beach;
    }

    @Override
    public void delete(Integer id) {
        modelList.remove(id);
    }

    @Override
    public void deleteAll() {
        modelList.clear();
    }
}
