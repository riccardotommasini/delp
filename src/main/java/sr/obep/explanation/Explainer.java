package sr.obep.explanation;

import org.semanticweb.owlapi.model.OWLAxiom;
import org.semanticweb.owlapi.model.OWLClass;
import org.semanticweb.owlapi.model.OWLNamedIndividual;
import org.semanticweb.owlapi.model.OWLOntology;
import sr.obep.explanation.ExplanationException;
import sr.obep.processors.EventProcessor;

import java.util.Set;

/**
 * This interface returns the set of all the owl axioms that entail the given event class
 */

public interface Explainer extends EventProcessor {

    Set<Set<OWLAxiom>> explain(OWLOntology ontology, OWLNamedIndividual message, OWLClass c) throws ExplanationException;
}
