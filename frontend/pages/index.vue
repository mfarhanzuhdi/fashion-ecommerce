<template>
  <div class="py-12">
    <div class="text-center">
      <h1 class="text-4xl font-bold text-gray-900 mb-4">
        Welcome to Fashion E-Commerce
      </h1>
      <p class="text-xl text-gray-600 mb-8">
        Discover the latest fashion trends
      </p>
      <NuxtLink 
        to="/products" 
        class="inline-block bg-indigo-600 text-white px-8 py-3 rounded-lg hover:bg-indigo-700"
      >
        Shop Now
      </NuxtLink>
    </div>

    <div class="mt-12">
      <h2 class="text-2xl font-bold text-gray-900 mb-6">Featured Products</h2>
      <div class="grid grid-cols-1 md:grid-cols-2 lg:grid-cols-4 gap-6">
        <div class="bg-white rounded-lg shadow p-4 text-center">
          <p class="text-gray-500">Loading products...</p>
        </div>
      </div>
    </div>
  </div>
</template>

<script setup lang="ts">
definePageMeta({
  layout: 'default',
})
</script>