package ca.tetervak.flowerdata.repository

import androidx.lifecycle.LiveData
import ca.tetervak.flowerdata.domain.Flower

interface FlowerRepository {
    fun getAll(): LiveData<List<Flower>>
    fun get(id: Long): LiveData<Flower>
}