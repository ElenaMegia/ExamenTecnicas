package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import javax.swing.*;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class DialogoWindowsTest {

    @Mock
    private JFrame main;
    @Mock
    private JPanel panel;
    @InjectMocks
    private DialogoWindows underTest;

    @Test
    void render() {
    }

    @Test
    void mostrarMensaje() {
    }

    @Nested
    class WhenRendering {
        @BeforeEach
        void setup() {
        }
    }

    @Nested
    class WhenMostraringMensaje {
        @BeforeEach
        void setup() {
        }
    }
}