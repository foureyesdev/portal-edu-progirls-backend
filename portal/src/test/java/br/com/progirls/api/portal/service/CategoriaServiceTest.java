package br.com.progirls.api.portal.service;

import br.com.progirls.api.portal.mapper.CategoriaMapper;
import br.com.progirls.api.portal.model.dto.categoria.CategoriaResponseDTO;
import br.com.progirls.api.portal.model.entity.Categoria;
import br.com.progirls.api.portal.repository.CategoriaRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.time.LocalDateTime;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.verifyNoInteractions;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class CategoriaServiceTest {

    @Mock
    private CategoriaRepository categoriaRepository;

    @Mock
    private CategoriaMapper categoriaMapper;

    @InjectMocks
    private CategoriaService categoriaService;

    private Categoria categoria;
    private CategoriaResponseDTO categoriaResponseDTO;

    @BeforeEach
    void setUp() {
        categoria = new Categoria();
        categoria.setId(1L);
        categoria.setNome("Artigo");
        categoria.setDataCriacao(LocalDateTime.now());

        categoriaResponseDTO = new CategoriaResponseDTO(categoria.getId(), categoria.getNome());
    }

    @Test
    @DisplayName("Deve retornar lista de categorias quando existirem registros")
    void deveRetornarListaDeCategoriasQuandoExistiremRegistros() {
        // arrange
        when(categoriaRepository.findAllCategoriasSorted()).thenReturn(List.of(categoria));
        when(categoriaMapper.toDTO(categoria)).thenReturn(categoriaResponseDTO);

        // act
        List<CategoriaResponseDTO> categorias = categoriaService.listar();

        // assert
        assertNotNull(categorias);
        assertEquals(1, categorias.size());
        assertEquals("Artigo", categorias.get(0).nome());

        verify(categoriaRepository, times(1)).findAllCategoriasSorted();
        verify(categoriaMapper, times(1)).toDTO(categoria);
    }

    @Test
    @DisplayName("Deve retornar lista vazia quando não houver registros")
    void deveRetornarListaVaziaQuandoNaoHouverRegistros() {
        // arrange
        when(categoriaRepository.findAllCategoriasSorted()).thenReturn(Collections.emptyList());

        // act
        List<CategoriaResponseDTO> categorias = categoriaService.listar();

        // assert
        assertNotNull(categorias);
        assertTrue(categorias.isEmpty());

        verify(categoriaRepository, times(1)).findAllCategoriasSorted();
        verifyNoInteractions(categoriaMapper);
    }
}