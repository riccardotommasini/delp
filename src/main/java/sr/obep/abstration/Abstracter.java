package sr.obep.interfaces;

import sr.obep.implementations.SemanticEvent;

import java.util.List;

/**
 * Created by Riccardo on 03/11/2016.
 */

public interface Abstracter extends EventProcessor {

    List<SemanticEvent> lift(SemanticEvent abox);

}
