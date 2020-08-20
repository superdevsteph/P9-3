package com.dummy.myerp.consumer.dao.impl.db.dao;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

/**
 * Classe de test de l'initialisation du contexte Spring
 */
class TestInitSpring extends ConsumerTestCase {

    /**
     * Constructeur.
     */
    TestInitSpring() {
        super();
    }


    /**
     * Teste l'initialisation du contexte Spring
     */
    @Test
    void testInit() {
        SpringRegistry.init();
        assertNotNull(SpringRegistry.getDaoProxy());
    }
}
