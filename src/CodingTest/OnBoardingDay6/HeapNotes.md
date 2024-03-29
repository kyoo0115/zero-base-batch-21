# 힙 (Heap) Java

## 개요
힙은 완전 이진 트리의 일종으로, 각 부모 노드가 자식 노드보다 크거나 같은 값을 가지는 특성을 가진 데이터 구조입니다. 이러한 특성 때문에 힙은 우선순위 큐와 같은 데이터 구조를 구현하는 데 주로 사용됩니다.

## 기본 원칙

1. **선언 및 초기화:**
    - Java에서 힙은 `PriorityQueue` 클래스를 사용하여 선언하고 초기화할 수 있습니다.
      ```java
      PriorityQueue<Integer> heap = new PriorityQueue<>();
      ```

2. **요소 추가:**
    - 힙에 요소를 추가하는 것은 `add` 메서드를 사용하여 수행됩니다.
      ```java
      heap.add(5);
      ```

3. **요소 제거:**
    - 힙에서 요소를 제거하는 것은 `poll` 메서드를 사용하여 수행됩니다. 이 메서드는 힙의 루트 요소를 제거하고 반환합니다.
      ```java
      int root = heap.poll();
      ```

4. **힙의 크기:**
    - 힙의 크기는 `size` 메서드를 사용하여 얻을 수 있습니다.
      ```java
      int size = heap.size();
      ```

## 사용 사례

힙은 다양한 시나리오에서 사용됩니다.

- **우선순위 큐 구현:**
  힙은 우선순위 큐를 구현하는 데 사용됩니다. 우선순위 큐는 각 요소가 우선순위를 가지며, 가장 높은 우선순위를 가진 요소가 먼저 제거되는 데이터 구조입니다.

- **K번째 최대/최소 요소 찾기:**
  힙은 K번째 최대 또는 최소 요소를 찾는 문제를 효율적으로 해결하는 데 사용될 수 있습니다.

- **정렬된 데이터 병합:**
  힙은 여러 정렬된 데이터 스트림을 병합하는 데 사용될 수 있습니다.

## 효율성과 복잡성

1. **시간 복잡성:**
    - 요소 추가: O(log n)
    - 요소 제거: O(log n)
    - 최소/최대 요소 액세스: O(1)

2. **공간 복잡성:**
    - O(n) - 힙은 모든 요소를 저장하기 위해 메모리를 필요로 합니다.

## 일반적인 힙 메서드

### 1. **`add` 메서드:**
- **설명:** 힙에 요소를 추가합니다.
- **예시:**
  ```java
  heap.add(5);
  ```

### 2. **`poll` 메서드:**
- **설명:** 힙에서 루트 요소를 제거하고 반환합니다.
- **예시:**
  ```java
  int root = heap.poll();
  ```

### 3. **`size` 메서드:**
- **설명:** 힙의 크기(요소 수)를 반환합니다.
- **예시:**
  ```java
  int size = heap.size();
  ```

## 결론

힙은 다양하고 효율적인 데이터 구조로 다양한 응용 프로그램에서 사용됩니다. 힙의 원칙과 일반적인 메서드를 이해하는 것은 효과적인 프로그래밍과 알고리즘 설계에 중요합니다. 응용 프로그램의 특정 요구 사항에 기반하여 힙 작업의 시간 및 공간 복잡성을 고려하여 합리적인 선택을 할 수 있도록 유의해야 합니다.