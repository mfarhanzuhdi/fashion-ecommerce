<template>
  <div class="min-h-screen bg-gray-50">
    <nav class="bg-white shadow">
      <div class="max-w-7xl mx-auto px-4 sm:px-6 lg:px-8">
        <div class="flex justify-between h-16">
          <div class="flex items-center">
            <div class="text-xl font-bold text-indigo-600">👗 Fashion Store</div>
          </div>
          <div class="flex items-center space-x-4">
            <NuxtLink to="/" class="text-gray-700 hover:text-indigo-600">Home</NuxtLink>
            <NuxtLink to="/products" class="text-gray-700 hover:text-indigo-600">Products</NuxtLink>
          </div>
        </div>
      </div>
    </nav>

    <main class="max-w-7xl mx-auto px-4 sm:px-6 lg:px-8 py-8">
      <NuxtPage />
    </main>

    <footer class="bg-gray-900 text-white mt-12">
      <div class="max-w-7xl mx-auto px-4 sm:px-6 lg:px-8 py-8">
        <p class="text-center">&copy; 2026 Fashion E-Commerce. All rights reserved.</p>
      </div>
    </footer>
  </div>
</template>

<script setup lang="ts">
// Global app setup
</script>