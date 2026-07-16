import pytest
from python_functions import dijkstra

def test_dijkstra_basic():
    graph = [[0, 1, 4], [1, 0, 2], [4, 2, 0]]
    assert dijkstra(graph, 0, 2) == 3  # 0 -> 1 -> 2
    assert dijkstra(graph, 1, 0) == 1  # 1 -> 0
    assert dijkstra(graph, 0, 1) == 1  # 0 -> 1
    assert dijkstra(graph, 1, 2) == 2  # 1 -> 2

def test_dijkstra_no_path():
    graph = [[0, 0], [0, 0]]
    assert dijkstra(graph, 0, 1) == -1  # No path exists

def test_dijkstra_single_node():
    graph = [[0]]
    assert dijkstra(graph, 0, 0) == 0  # Same node

def test_dijkstra_disconnected_graph():
    graph = [[0, 1, 0], [1, 0, 0], [0, 0, 0]]
    assert dijkstra(graph, 0, 2) == -1  # No path exists

def test_dijkstra_empty_graph():
    graph = []
    assert dijkstra(graph, 0, 0) == -1  # Invalid graph

def test_dijkstra_graph_with_negative_weights():
    graph = [[0, 1, -2], [1, 0, 2], [-2, 2, 0]]
    assert dijkstra(graph, 0, 2) == -1  # Dijkstra's algorithm does not work with negative weights

def test_dijkstra_graph_with_inf():
    graph = [[0, float('inf'), 1], [float('inf'), 0, 2], [1, 2, 0]]
    assert dijkstra(graph, 0, 1) == 3  # 0 -> 2 -> 1

def test_dijkstra_graph_with_multiple_paths():
    graph = [[0, 10, 5], [10, 0, 2], [5, 2, 0]]
    assert dijkstra(graph, 0, 1) == 7  # 0 -> 2 -> 1

def test_dijkstra_graph_with_self_loops():
    graph = [[0, 1, 2], [1, 0, 1], [2, 1, 0]]
    assert dijkstra(graph, 0, 1) == 1  # 0 -> 1
    assert dijkstra(graph, 0, 2) == 2  # 0 -> 2

def test_dijkstra_graph_with_multiple_edges():
    graph = [[0, 1, 1], [1, 0, 1], [1, 1, 0]]
    assert dijkstra(graph, 0, 2) == 1  # 0 -> 2 directly
    assert dijkstra(graph, 1, 0) == 1  # 1 -> 0 directly

def test_dijkstra_graph_with_large_numbers():
    graph = [[0, 1000000, 2000000], [1000000, 0, 3000000], [2000000, 3000000, 0]]
    assert dijkstra(graph, 0, 2) == 2000000  # 0 -> 2 directly
    assert dijkstra(graph, 1, 0) == 1000000  # 1 -> 0 directly