package com.example.lembretedecompras.ui.dao

import androidx.lifecycle.LiveData
import androidx.room.*
import com.example.lembretedecompras.ui.models.Produto

@Dao
interface ProdutoDao {
    @Query("SELECT * from tabela_produto ORDER BY nome_produto ASC")
    fun getListaDeProdutos(): LiveData<List<Produto>>
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insert(produto: Produto)
    @Query("DELETE FROM tabela_produto")
    suspend fun deleteAll()
    @Delete
    fun delete(produto: Produto)

}
