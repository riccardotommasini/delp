package sr.obep.abstration;

import org.semanticweb.owlapi.model.OWLClass;
import org.semanticweb.owlapi.model.OWLNamedIndividual;
import org.semanticweb.owlapi.model.OWLOntology;
import sr.obep.processors.EventProcessor;

import java.util.Set;

/**
 * Created by Riccardo on 03/11/2016.
 */

public interface Abstracter extends EventProcessor {

    Set<OWLClass> lift(OWLOntology copy, OWLNamedIndividual event);

}
