/**
 */
package org.palladiosimulator.pcm.confidentiality.context.policy;

import org.eclipse.emf.common.util.EList;

import org.palladiosimulator.pcm.confidentiality.context.model.Context;

import org.palladiosimulator.pcm.core.entity.Entity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Policy</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.pcm.confidentiality.context.policy.Policy#getContexts <em>Contexts</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.pcm.confidentiality.context.policy.PolicyPackage#getPolicy()
 * @model
 * @generated
 */
public interface Policy extends Entity {
    /**
     * Returns the value of the '<em><b>Contexts</b></em>' reference list.
     * The list contents are of type {@link org.palladiosimulator.pcm.confidentiality.context.model.Context}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Contexts</em>' reference list.
     * @see org.palladiosimulator.pcm.confidentiality.context.policy.PolicyPackage#getPolicy_Contexts()
     * @model
     * @generated
     */
    EList<Context> getContexts();

} // Policy
