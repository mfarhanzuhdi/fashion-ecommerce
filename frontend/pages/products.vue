<template>
  <div class="py-12">
    <div class="mb-8">
      <h1 class="text-3xl font-bold text-gray-900">Products</h1>
      <p class="text-gray-600 mt-2">Browse our fashion collection</p>
    </div>

    <div class="grid grid-cols-1 md:grid-cols-2 lg:grid-cols-4 gap-6">
      <div class="bg-white rounded-lg shadow hover:shadow-lg transition">
        <div class="bg-gray-200 h-48 rounded-t-lg flex items-center justify-center">
          <span class="text-gray-500">Product Image</span>
        </div>
        <div class="p-4">
          <h3 class="text-lg font-semibold text-gray-900">Product Name</h3>
          <p class="text-gray-600 text-sm mt-1">Product description</p>
          <div class="mt-4 flex justify-between items-center">
            <span class="text-2xl font-bold text-indigo-600">$99.99</span>
            <button class="bg-indigo-600 text-white px-4 py-2 rounded hover:bg-indigo-700">
              Add to Cart
            </button>
          </div>
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